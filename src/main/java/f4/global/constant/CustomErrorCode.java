package f4.global.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CustomErrorCode {

  // Bad Request 400
  NOT_VALID_LOGIN_PASSWORD("/user/v1/login", 400, "비밀번호가 틀렸습니다."),;

  // Unathorized 401

  // Forbidden 402

  // Not Found 404

  private final String path;
  private final int code;
  private final String message;
}
