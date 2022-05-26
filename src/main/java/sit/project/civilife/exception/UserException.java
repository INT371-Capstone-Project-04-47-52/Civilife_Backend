package sit.project.civilife.exception;

public class UserException extends BaseException {

    public UserException(String code) {
        super(code);
    }

    public static UserException requestNull() {
        return new UserException("Signup request is null");
    }

    public static UserException emailNull() {
        return new UserException("Signup email is null");
    }


    public static UserException createEmailNull() {
        return new UserException("Create email is null");
    }

    public static UserException creatEmailExist() {
        return new UserException("Create email is exist");
    }

    public static UserException createPasswordNull() {
        return new UserException("Create password is null");
    }


    public static UserException loginEmailNotFound() {
        return new UserException("Login email does not exist");
    }

    public static UserException loginPasswordIncorrect() {
        return new UserException("Login password incorrect");
    }

    public static UserException userIdNotfound() {
        return new UserException("User id not found");
    }

    public static UserException userUnAuthorized() {
        return new UserException("UnAuthorized");
    }
}


