package controller.commands;

import javax.servlet.http.HttpServletRequest;

public class UserCommand implements Command {

    @Override
    public String execute(HttpServletRequest rquest){
        return "WEB-INF/user/userbasis.jsp";
    }
}