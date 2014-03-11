#! /bin/sh

echo "Back up files......."

exclude=(".idea"  "target")

backup(){
    filelist=`ls -l $PATH`
    for filename in $filelist; do
	if [ -f $filename ]; then
	    echo ""
	fi
    done
}

main(){
    commond=`cp -r * ../NexBac/`
    echo $commond
}

main