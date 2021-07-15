package foobar;

import io.micronaut.context.annotation.Context;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import javax.inject.Inject;
import lombok.RequiredArgsConstructor;

@Context
@Controller
@RequiredArgsConstructor
public class FooController {

  @Inject
  private final FooService foo;

  @Get("/")
  String hello(){
    return "Hello! " + foo.currentDateTime();
  }
}
