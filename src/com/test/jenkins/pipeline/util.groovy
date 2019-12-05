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


def wrap(def keySet){
	return new SortedProperties(new Properties(),keySet);
}

return this;