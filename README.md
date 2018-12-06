## Passage Licensing Runtime  

The Passage Licensing Runtime is a part of the [Passage Licensing](https://projects.eclipse.org/projects/technology.passage) solution.
This component verifies that the software license is valid in accordance with the specified license requirements.
The Equinox-based implementation includes various validators for the subscription-based, node locked and other types of licenses.

### How to use

Just include the Passage Licensing Runtime bundles in your product.

### How it works

The Passage Licensing Runtime works inside your product installed on the user side. Its basic steps are as follows:
1. Get the system configuration specified in the Licensing Operator client: the feature identifiers and the respective usage restrictions.
2. Get the license conditions. By default, the tool looks for the license files located in the osgi.instance.area directory.
3. Compare the license specified configuration with the current system state (the current date, node id, etc) to confirm the license is active and valid.
4. Use the system configuration and the evaluated license state to make a decision.
5. If there is a license error, call the required constraint function to impose restrictions: limit certain functionality or disable everything.

### Related repositories

To find out more about the Passage Licensing solution, check out the following repositories:
- [Passage Licensing Operator](https://github.com/arsysop/passage-loc)
- [Passage Licensing Backend](https://github.com/arsysop/passage-lbc)
- [Passage Binary Resources and Components](https://github.com/arsysop/passage-brc)

### License

Copyright 2018 ArSysOp

Licensed under the [Apache License, Version 2.0](https://projects.eclipse.org/content/apache-license-version-2.0) license, see the [LICENSE](https://github.com/arsysop/passage-lic/blob/develop/LICENSE) file for details.

