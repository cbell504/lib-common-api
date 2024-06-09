package dev.christopherbell.libs.common.api.contracts;

import java.util.UUID;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RequestTest {

  @SuperBuilder
  @NoArgsConstructor
  static class RequestChild extends Request {

  }

  @Test
  public void requestBuilderTest() {
    var requestId = UUID.randomUUID();
    var request = RequestChild.builder()
        .requestId(requestId)
        .build();

    Assertions.assertEquals(requestId, request.getRequestId());
  }

  @Test
  public void requestTest() {
    var requestId = UUID.randomUUID();
    var request = new RequestChild();
    request.setRequestId(requestId);

    Assertions.assertEquals(requestId, request.getRequestId());
  }
}
