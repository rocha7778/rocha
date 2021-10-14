package desing.creational.builder;

public class Assembler {
	
	public static Car construct(Builder builder) {
		
		builder.buildHead();
		builder.buildBody();
		builder.buildWheel();
		return builder.buildPart();
	}

}
