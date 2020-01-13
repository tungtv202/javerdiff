import lombok.Builder;

import java.util.List;

@Builder
public class PersonWithAddress {
    private Integer id;
    private String name;
    private List<Address> address;
}
