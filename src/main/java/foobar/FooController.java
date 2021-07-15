package foobar;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import javax.inject.Inject;

@Controller
public class FooController {

  @Inject
  private final FooService foo;

  FooController(FooService foo){
    this.foo = foo;
  }

  @Get("/")
  String hello(){
    return "Hello! " + foo.currentDateTime();
  }
}