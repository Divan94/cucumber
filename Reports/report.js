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
  "name": "Add Customer validation by using 1 dim list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sce"
    }
  ]
});
formatter.step({
  "name": "User enter all the fields by one dim list concept",
  "rows": [
    {
      "cells": [
        "Divan",
        "Rajendran",
        "divakar.r0610@gmail.com",
        "Potheri",
        "7200808733"
      ]
    }
  ],
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
  "name": "Add Customer validation by using 1 dim map",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sce"
    }
  ]
});
formatter.step({
  "name": "User enter all the fields by one dim map concept",
  "rows": [
    {
      "cells": [
        "fname",
        "Divakar"
      ]
    },
    {
      "cells": [
        "lname",
        "R"
      ]
    },
    {
      "cells": [
        "mail",
        "divakar.r0610@gmail.com"
      ]
    },
    {
      "cells": [
        "address",
        "guduvancheri"
      ]
    },
    {
      "cells": [
        "phono",
        "8682844259"
      ]
    }
  ],
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
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enter all the fields \"\u003cfname\u003e\",\"\u003clname\u003e\",\"\u003cmail\u003e\",\"\u003caddres\u003e\",\"\u003cphono\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify customer id is generated",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "mail",
        "address",
        "phono"
      ]
    },
    {
      "cells": [
        "Divan",
        "R",
        "divakar@gmail.com",
        "potheri",
        "8682844259"
      ]
    },
    {
      "cells": [
        "Prem",
        "G",
        "prem@gmail.com",
        "tambaram",
        "9952043537"
      ]
    },
    {
      "cells": [
        "Sathish",
        "N",
        "sathish@gmail.com",
        "perungalathur",
        "7200808733"
      ]
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
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sce"
    }
  ]
});
formatter.step({
  "name": "User enter all the fields \"Divan\",\"R\",\"divakar@gmail.com\",\"\u003caddres\u003e\",\"8682844259\"",
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
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sce"
    }
  ]
});
formatter.step({
  "name": "User enter all the fields \"Prem\",\"G\",\"prem@gmail.com\",\"\u003caddres\u003e\",\"9952043537\"",
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
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sce"
    }
  ]
});
formatter.step({
  "name": "User enter all the fields \"Sathish\",\"N\",\"sathish@gmail.com\",\"\u003caddres\u003e\",\"7200808733\"",
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