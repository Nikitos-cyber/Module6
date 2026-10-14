package OOP;

public interface Ex extends Example {
   default int foo(){
       return 123 + 23;
   }
}
