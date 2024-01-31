package testdatapojo;

public class GiftCardCreationTestDataPOJO {

	public String testDataID;
	public String giftCardType;
	public String initialValue;
	public String age;
	public String couponCode;
	public String recipientName;
	public String recipientEmail;
	public String senderName;
	public String senderEmail;
	public String message;

	@Override
	public String toString() {
		return "NewGiftCard [testDataID=" + testDataID + ", giftCardType=" + giftCardType + ", initialValue="
				+ initialValue + ", age=" + age + ", couponCode=" + couponCode + ", recipientName=" + recipientName
				+ ", senderName=" + senderName + ", senderEmail=" + senderEmail + ", message=" + message + "]";
	}
}