
require intechos.bb
 
IMAGE_FEATURES += " \
 	tools-sdk \
 	tools-debug \
 	package-management \
"
 
JAVA += " \
 	openjdk-8 \
"
 
IMAGE_INSTALL += " \
 	gcc \
 	cmake \
 	vim \
 	nano \
 	git \
	valgrind \
 	subversion \
"

export IMAGE_BASENAME = "intechos-dev"

