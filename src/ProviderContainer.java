import java.util.List;

public class ProviderContainer<T>{
	Provider<? super T> provider;

	public void setProvider(Provider<? super T> provider) {
		this.provider = provider;
	}

	public Provider<? super T> getProvider() {
		return provider;
	}


	void getData(List<T> inData){
		 this.provider.doSomeThing(inData);
	}
}
