/*
package com.myjunit;



@RunWith(MockitoJUnitRunner.class)
public class TestClass {
	@Mock
	ServiceDao dao = new ServiceDao();

	@InjectMocks
	Service service = new Service();
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test
	public void testService() throws MyException {

		when(dao.getdata()).thenReturn(10);
		Assert.assertEquals(100, service.testData(1));
	}

	@Test
	public void testServicExceptione() throws MyException {
		when(dao.getdata()).thenReturn(10);
		expectedEx.expect(MyException.class);
		expectedEx.expectMessage("test");
		service.testData(0);
	}
}
 */