#!groovy

import java.util.Properties;

public class SortedProperties extends Properties{

	def sortedKeys;

	public SortedProperties(Properties props,def sortedKeys){
		super(props);
		this.sortedKeys = sortedKeys;
	}
	
	def Set keySet(){
		return sortedKeys;
	}
}


def wrap(Properties props,def keySet){
	return new SortedProperties(props,keySet);
}

return this;