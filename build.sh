if [ $# -eq 0 ] ; then
  mvn -Dspring.profiles.active=test -Dmaven.javadoc.skip=true clean package -U
else
  if [ $1 = "-q" ] ; then
    mvn -Dmaven.test.skip=true -Dmaven.javadoc.skip=true clean package -U
  else
    echo "build.sh [-q]"
    exit 0
  fi
fi

if [ $? -ne 0 ] ; then
  echo "mvn package error"
  exit -1
fi

rm -rf output
mkdir output

mkdir -p output/bin
mkdir -p output/conf

cp course-demo/target/course-demo-version.jar output/bin/course-demo.jar
cp course-demo/deploy/start.sh output/bin
cp course-demo/deploy/stop.sh output/bin
cp -rf course-demo/src/main/resources/* output/conf
