# Permify Java Deployment

## Deployment Process

The release process is partially automated via GitHub Actions. Here’s how it works:

1. **Triggering the Generator Workflow**  
   - After a release is created in the main branch of main Permify repository, the generator workflow will be triggered automatically.
   - If it does not trigger automatically, it can be run manually using **Workflow Dispatch**.  

2. **Pull Request Creation & Merge**  
   - The generator workflow will create a pull request and merge it back into the repository.  

3. **Dependency Check & Build**  
   - Ensure that the dependency versions in `build.gradle` match those in `pom.xml`.  
   - Run a clean build:   
     ```bash
     ./gradlew clean build
     ```  

4. **Deployment**  
   - Deployment to Maven Central (Sonatype) is **not yet configured** in GitHub Actions.  
   - To publish locally:  
     1. Configure your **Sonatype credentials** (`username` and `password`) in `gradle.properties`.  
     2. Run:  
        ```bash
        ./gradlew sonatypeCentralUpload
        ```  
   - This will push the artifact to the Maven Central registry.  

