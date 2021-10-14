package desing.structural.adapter;

public class AdapterPlug implements Plug {

	@Override
	public int recharge() {
		// TODO Auto-generated method stub
		Plug plug = new StandardPlug();
		int v = plug.recharge();
		v = v-108;
		return v;
	}

}
