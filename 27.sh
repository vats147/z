
linecount=0
wordcount=0
count=0
sum=0
for var in "$1"
do
while read line
do
	linecount=$((linecount+1))
	echo -n "$linecount"	
	for word in $line
	do
		wordcount=$((wordcount+1))
#		echo "$word"
		rem=$(($word%10))
#		count=`expr length $word`
#		echo "count is :$count"
		sum=$((sum+count))


		echo $rem
	done
	len=`expr "$line" : '.*'`
	echo "the length of the input string is $len"	
#		echo "total charter in string: ${#line}"
#	count=`expr length "$line"`
 #               echo "count is :$count"

done<$var
done

#echo "$linecount"
#echo "$wordcount"
#echo "$count"
