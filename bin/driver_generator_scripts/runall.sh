#!/bin/bash
#under msp everything should be identical on all computers
#MACHINE_SPECIFIC_PATH="$HOME/Graduation_Studies/ThesisWork/HelperMethodAnalysis"

# Run all the driver generators
cd ./classmate
./driver_generator_classmate_1.5.1.sh
./runjava_classmate_1.5.1.sh
cd ../commons_collections
./driver_generator_commons_collections_4.3.sh
./runjava_commons_collections_4.3.sh
cd ../commons_math
./driver_generator_commons_math_3.6.1.sh
./runjava_commons_math_3.6.1.sh
#./gson/driver_generator_gson_parent_2.8.5.sh
#./jackson_annotations/driver_generator_jackson_annotations_2.10.2.sh
cd ../jsoup
./driver_generator_jsoup_1.10.1.sh
./runjava_jsoup_1.10.1.sh
cd ../ph_commons
./driver_generator_ph_commons_9.3.9.sh
./runjava_ph_commons_9.3.9.sh
cd ../plexus_utils
./driver_generator_plexus_utils_3.3.0.sh
./runjava_plexus_utils_3.3.0.sh
