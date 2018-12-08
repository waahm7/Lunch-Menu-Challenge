package menu;

import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class CustomErrorController extends AbstractErrorController {

    public CustomErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
    }

    @RequestMapping(value = "/error", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Map<String, Object> handleError(HttpServletRequest request) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(request, true);
        return buildErrorMessage(errorAttributes);
    }

    private Map<String, Object> buildErrorMessage(Map<String, Object> errorAttributes) {

        errorAttributes.remove("trace");
        errorAttributes.remove("timestamp");
        errorAttributes.remove("path");

        if ((int) errorAttributes.get("status") == 404)
            errorAttributes.put("message", "page does not exist");

        return errorAttributes;

    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}