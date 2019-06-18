package com.weir.designModel.decoratorPattern;

public class ComponentDecorator extends Component {
	private Component component;
	
	public ComponentDecorator(Component component){
		this.component = component;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		component.display();
	}

}
