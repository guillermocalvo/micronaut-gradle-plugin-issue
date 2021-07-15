package foobar;

import java.util.Date;
import javax.inject.Singleton;

@Singleton
public class FooService {

  public String currentDateTime(){
    return new Date().toString();
  }
}
