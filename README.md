## Passage Licensing Runtime  

The Passage Licensing Runtime is a part of the Eclipse Passage licensing system. 
This component verifies that the software license is valid in accordance with the specified license requirements.
The Equinox-based implementation includes various validators for the subscription-based, node locked and other types of licenses.

### How to use

Just include the Passage Licensing Runtime bundles in your product.

### How it works

The Passage Licensing Runtime works inside your product installed on the user side. Its basic steps are as follows:
1. Get the system configuration specified in the Licensing Operator client and extract the identifiers of features to be controlled.
2. Get the license requirements. By default, the tool looks for the license files located in the user's home subdirectory.
3. Compare the license specified configuration with the current system state (the current date, node id, etc) to detect invalid cases.
4. Pass the system configuration requirements and the detected invalid cases to the decision maker.
5. Call the required constraint function to show the license expiration message, limit certain functionality or disable everything.

### Related repositories

To find out more about the Eclipse Passage licensing system, check out the following repositories:
- [Passage Licensing Operator](https://github.com/arsysop/passage-loc)
- [Passage Licensing Backend](https://github.com/arsysop/passage-lbc)
- [Passage Binary Resources and Components](https://github.com/arsysop/passage-brc)

### License

Copyright 2018 ArSysOp

Licensed under the [Apache License, Version 2.0](https://projects.eclipse.org/content/apache-license-version-2.0) license, see the [LICENSE](https://github.com/arsysop/passage-lic/blob/develop/LICENSE) file for details.
