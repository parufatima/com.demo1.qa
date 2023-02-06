Feature: This is a demoblez feature file


@Test
Scenario: Verify home page
Given Open application <"URL">
When Click on home page  link
Then Verify home page
@Test
Scenario: Verify contact link tab in the Homepage is aviable to access Login page
Given Open application <"URL">
When Click on Contact link in Homepage
Then Verify Contact page is accessible to the user

@Test
Scenario: Verify About us link tab in the Homepage is aviable to access About us page
Given Open application <"URL">
When Click on About Us link in Homepage
Then  Verify About us  page is accessible to the user


@Test
Scenario: Verify Cart link tab in the Homepage is aviable to access Cart page
Given Open application <"URL">
When Click on Cart link in Homepage
Then  Verify Cart  page is accessible to the user

@Test
Scenario: Verify Login link tab in the Homepage is aviable to access Login page
Given Open application <"URL">
When Click on Login link in Homepage
Then  Verify Login  page is accessible to the user

@Test
Scenario: Verify Sign Up link tab in the Homepage is aviable to access Sign Up page
Given Open application <"URL">
When Click on Sign Up link in Homepage
Then  Verify Sign Up  page is accessible to the user


















