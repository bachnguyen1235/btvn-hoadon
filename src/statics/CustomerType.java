package statics;

public enum CustomerType {
    PERSONAL("ca nhan"),
    HANHCHINH("hanh chinh"),
    KINHDOANH("kinh doanh");
public String value;

    CustomerType(String value) {
        this.value = value;
    }
}
