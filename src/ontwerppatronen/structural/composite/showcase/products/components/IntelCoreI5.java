package ontwerppatronen.structural.composite.showcase.products.components;

import ontwerppatronen.structural.composite.showcase.Presentable;

public class IntelCoreI5 implements Presentable {

	@Override
	public void show() {
		System.out.println("Intel Core I5!");
		System.out.println("Processor: 1.2GHz dual-core Intel Core m3, Turbo Boost up to 3.0GHz, with 4MB L3 cache");
	}

}
