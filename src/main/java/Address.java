import lombok.Builder;

@Builder
public class Address {
    private String country;

    public Address(String country) {
        this.country = country;
    }

}
