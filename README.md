## Passage Licensing Integration Components (LIC) 

The Passage LIC is a part of the [Passage Licensing](https://projects.eclipse.org/proposals/eclipse-passage) solution.
This component verifies that the software has sufficient license grants in accordance with the specified licensing requirements.
The Equinox-based implementation includes various validators for the time-limited, node-locked and other types of licenses.

### How to use

Just include the Passage LIC bundles in your product and declare licensing requirement for your features.

### How it works

The Passage LIC works inside your product installed on the user side. Its basic steps are as follows:
1. Get the system configuration specified in the Licensing Operator client: the feature identifiers and the respective usage restrictions.
2. Get the license conditions. The LIC may be tuned to look through different locations like `user.home` and `osgi.instance.area`.
3. Compare the license specified configuration with the current system state (the current date, node id, etc) to confirm the license is active and valid.
4. Use the system configuration and the evaluated license state to make a decision.
5. If there are uncovered licensing requirements, call the required constraint functions to impose restrictions: limit certain functionality or disable everything.

### Related repositories

To find out more about the Passage Licensing solution, check out the following repositories:
- [Passage Binary Resources and Components](https://github.com/arsysop/passage-brc)
- [Passage Licensing Operator](https://github.com/arsysop/passage-loc)
- [Passage Licensing Backend](https://github.com/arsysop/passage-lbc)

### License

Copyright 2018-2019 ArSysOp

Licensed under the [Apache License, Version 2.0](https://projects.eclipse.org/content/apache-license-version-2.0) license, see the [LICENSE](https://github.com/arsysop/passage-lic/blob/develop/LICENSE) file for details.

