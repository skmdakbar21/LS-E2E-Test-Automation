# Introduction 
This repository contains Lincoln sentry's functional test automation scripts. These automation scripts are web based end to end scenarios.

# Getting Started
TO setup this test framework locally, follow below instructions.
1. Install Java Jdk(Version 1.8 or above) and add JAVA_HOME to environment variables with value of /bin path.
2. Install Maven 3.6.0.
4. Pull this repository
''git pull <azure repo path>''
5. Update Maven dependencies & Java dependencies by updating project.

# Build and Test
1. Command to run tests with tags on local machine's chrome.
''mvn test "-Dcucumber.options=--tags <tag>" -Dbrowser=localChrome
Note: Download latest (based on your chrome browser version) chromedriver from https://chromedriver.chromium.org/downloads and place it under LS-E2E-Test-Automation\drivers folder.
2. Command to run tests on Cross browser testing (CBT) cloud platform.
''mvn test "-Dcucumber.options=--tags <tag>" -Dbrowser=chrome''
''mvn test "-Dcucumber.options=--tags <tag>" -Dbrowser=chromeminus1''
''mvn test "-Dcucumber.options=--tags <tag>" -Dbrowser=firefox''
''mvn test "-Dcucumber.options=--tags <tag>" -Dbrowser=ie11''
''mvn test "-Dcucumber.options=--tags <tag>" -Dbrowser=safari13''
''mvn test "-Dcucumber.options=--tags <tag>" -Dbrowser=safari12''
''mvn test "-Dcucumber.options=--tags <tag>" -Dbrowser=edge''
Note: If browser not mentioned or wrong browser name mentioned, by default test runs on CBT chrome.
3. Command to exclude tests is...
''mvn test "-Dcucumber.options=--tags 'not @wip'" -Dbrowser=localChrome''
 
# Contribute
