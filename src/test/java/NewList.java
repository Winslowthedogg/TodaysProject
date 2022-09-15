import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

@FunctionalInterface
public interface NewList {

    LinkedList<BigDecimal> salary(List<Long> portion);



}
