package programs;

public class Program14 {
	private String partDescription;
	 private int quantity;
	 private double price;
	 public void Invoice(String pNum, String pDesc, int qty, double prc) {
	 String partNumber;
	if (pNum != null) partNumber=pNum; else partNumber="0";
	 if (pDesc != null) partDescription=pDesc; else partDescription="0";
	 if (qty > 0) quantity=qty; else quantity=0;
	 if (prc > 0.0) price=prc; else price=0;
	 }
	 
	 public String getPartNum(){
	 String partNumber = null;
	return partNumber;
	 }
	 
	 public String getPartDesc(){
	 return partDescription;
	 }
	 
	 public int getQuantity(){
	 return quantity;
	 }
	 
	 public double getPrice(){
	 return price;
	 }
	 
	 public void setPartNum(String pNum){
	 String partNumber;
	if (pNum != null) {partNumber=pNum;}
	 else {partNumber="0";}
	 }
	 
	 public void setPartDesc(String pDesc){
	 if (pDesc != null) {partDescription=pDesc;}
	 else {partDescription="0";}
	 }
	 public void setQuantity(int qty){
		 if (qty > 0) {quantity=qty;}
		 else {quantity=0;}
		 }
		 
		 public void setPrice(double prc){
		 if (prc > 0.0) {price=prc;}
		 else {price=0.0;}
		 }
		 
		 public double getInvoiceAmount(){
		 return (double)quantity*price;
		 }
		}


