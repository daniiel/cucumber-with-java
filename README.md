# Cucumber with Java

This is the project from the [Cucumber with Java-Build Automation Framework in lesser code](https://www.udemy.com/course/cucumber-tutorial/?utm_source=adwords&utm_medium=udemyads&utm_campaign=DSA_Catchall_la.EN_cc.ROW&utm_content=deal4584&utm_term=_._ag_88010211481_._ad_428734578876_._kw__._de_c_._dm__._pl__._ti_dsa-485138043266_._li_1003659_._pd__._&matchtype=b&gclid=EAIaIQobChMIhM3_hPe76QIVCrLICh0tywaTEAAYASAAEgIvjvD_BwE) course.

  - Maven
  - Java 8
  - Cucumber
  - Selenium WebDriver

### Run Tests

Open your favorite terminal and run these commands.

Run all test

```bash
$ mvn test
```

Run specific test by passing a tag

```sh
$ mvn test -Dcucumber.options="--tags @SeleniumTest"
```
