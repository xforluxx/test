
public class Task1 implements TaskInterface<Object>{
	private String lockName = "zwh";

	@Override
	public Object task() {
		System.out.println("Task1执行任务...");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return null;
	}

	@Override
	public String getLockName() {
		return lockName;
	}

}
