package testdatapojo;

public class DiscountCreationTestDataPOJO {

	public String isActive;
	public String name;
	@Override
	public String toString() {
		return "AddDiscountPOJO [isActive=" + isActive + ", name=" + name + ", discountType=" + discountType
				+ ", usePercentage=" + usePercentage + ", discountPercentage=" + discountPercentage
				+ ", maximumDiscountAmount=" + maximumDiscountAmount + ", discountAmount=" + discountAmount
				+ ", requiresCouponCode=" + requiresCouponCode + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", cumulativeWithOtherDiscounts=" + cumulativeWithOtherDiscounts + ", discountLimitation="
				+ discountLimitation + ", adminComment=" + adminComment + "]";
	}
	public String discountType;
	public String usePercentage;
	public String discountPercentage;
	public String maximumDiscountAmount;
	public String discountAmount;
	public String requiresCouponCode;
	public String startDate;
	public String endDate;
	public String cumulativeWithOtherDiscounts;
	public String discountLimitation;
	public String adminComment;
}