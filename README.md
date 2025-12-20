# SMS Checker lib-version
This repository contains a versioned library of a dummy SMS spam classifier. More information about the SMS checker can be found on [proksch/sms-checker](https://github.com/proksch/sms-checker). 

The repository, organization and the accompanying releases are used to learn about DevOps practices by student group [doda25-team7](https://github.com/doda25-team7). The work was done in the context of the course [DevOps for Distribued Apps (CS4295)](https://studyguide.tudelft.nl/courses/study-guide/educations/14776) at the TU Delft. The groups organization page links to the associated repositories. 

There are two workflows in this repository:
- ```release.yml```: Manually trigged workflow to release the next patch version. This is done by bumping the version, tagging and releasing that version, and finally marking the version snapshot by adding the tag to the verison.
- ```pre-release.yml```: Runs on every push on all branches except main to pre-release the branch state. The branches are named like ```app-1.2.3-new-feature-251112-124753``` etc. 

All the library builds are released alognside this repository on the Github library repository (ghcr.io). 