import lombok.Getter;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

@Getter


public class Sebastian {

    private Integer age;

 private LinkedHashMap<BigDecimal, Boolean> toDoList;

    protected static String title;




    public Sebastian(Integer age){
        setAge(age);
    }

    private void setAge(Integer age) {
       if (age < -18) throw new RuntimeException();
       this.age = age;
    }

    public void method(int task){


    }

    public void method(int task, int second){


    }

}
