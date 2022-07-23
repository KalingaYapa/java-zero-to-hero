package RestTemplate;

public class FuelTemplate
{
    private String consumerAddress;
    private String consumerUid;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String itemNo = "HG-5580";
    private String itemSerialNo;
    private String token;
    private String msg;
    private int consumerUidType = 1;
    private int itemCategory = 5;
    private int itemSubCategory = 2;
    private boolean status;

    public String getConsumerAddress() {
        return consumerAddress;
    }

    public void setConsumerAddress(String consumerAddress) {
        this.consumerAddress = consumerAddress;
    }

    public String getConsumerUid() {
        return consumerUid;
    }

    public void setConsumerUid(String consumerUid) {
        this.consumerUid = consumerUid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemSerialNo() {
        return itemSerialNo;
    }

    public void setItemSerialNo(String itemSerialNo) {
        this.itemSerialNo = itemSerialNo;
    }

    public int getConsumerUidType() {
        return consumerUidType;
    }

    public void setConsumerUidType(int consumerUidType) {
        this.consumerUidType = consumerUidType;
    }

    public int getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(int itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getItemSubCategory() {
        return itemSubCategory;
    }

    public void setItemSubCategory(int itemSubCategory) {
        this.itemSubCategory = itemSubCategory;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void populate() {
        this.consumerAddress = "Kandy";
        this.consumerUid = "954585455V";
        this.consumerUidType = 1;
        this.firstName = "User";
        this.lastName = "User1";
        this.mobileNo = "0784585455";
        this.itemNo = "HG-9886";
        this.itemCategory = 5;
        this.itemSerialNo = "N785458545855";
        this.itemSubCategory = 2;
    }
}
