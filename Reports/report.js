$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddCustomer.feature");
formatter.feature({
  "name": "Add Customer flow validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sce"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User launches demo telecom application",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click on add customer button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Add Customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sce"
    },
    {
      "name": "@Data"
    }
  ]
});
formatter.step({
  "name": "User enter all the fields",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click on submit button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verify customer id is generated",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});