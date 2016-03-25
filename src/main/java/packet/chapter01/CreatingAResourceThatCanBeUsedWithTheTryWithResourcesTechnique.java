package packet.chapter01;

public class CreatingAResourceThatCanBeUsedWithTheTryWithResourcesTechnique {

	public static void main(String[] args) throws Exception {
		try (FirstAutoCloseableResource resource1 = new FirstAutoCloseableResource();
				SecondAutoCloseableResource resource2 = new SecondAutoCloseableResource()) {
			resource1.manipulateResource();
			resource2.manipulateResource();
		} catch (Exception e) {
			e.printStackTrace();
			for (Throwable throwable : e.getSuppressed()) {
				System.out.println(throwable);
			}
		} finally {
			System.out.println("bbb");
		}

	}
}
