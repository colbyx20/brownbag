Demo Steps

Flow Chart Steps - tools
-- Developer
  - Code Checkout
  - Code Change 
  - Code Push
  - Merge to feature/branch

-- Automation Pipeline - Scheduled/Triggered/Manual 
  - SonarQube TEST feature/branch
  - Package new code && Build Image
  - Update deploy script with new Image TAG 
  - Deploy (Run image tag as container)



Write a Step by Step Script
