object Main {
   def main(args: Array[String]) {
      println("Hello, world!")
      
        val l = List(1,2,3,4,5).foldLeft(0)(_ + _)
        val l2 = List(1,2,3,4,5,6,7,8,9)

        val r1 = l2.foldLeft(0)((acc, v) => acc+v)
      
      
        val r2 = l2.foldLeft((0,0))((acc, v) => (acc._1+v, acc._2+1))
        
        val r3 = l2.foldLeft("List Print: ")((acc, v) => acc+" "+v)
        val r4 = l2.foldLeft(0,1,0)((acc,v) => (acc._1+v, acc._2*v, acc._3+1))
        val r5 = l2.foldLeft((0, 1, 0)) { 
            case ((sum, mult, count), v) => (sum + v, mult*v, count + 1)
        }
        
        val r6 = l2.foldLeft(List[Int]())((acc,v) => acc:+v)
        val r7 = l2.foldLeft((List[Int](), List[Int]()))((acc,v) => (acc._1:+v, List(v) ::: acc._2))
        
        val maxmin = l2.foldLeft(l2.head,l2.head)((acc, v) => 
            {
            var max=acc._1
            var min=acc._2
            if(acc._1 < v) 
                max=v 
            if(acc._2 > v)
                min=v
            
            (max, min)
            }
        )
        
        
        println(l)
      
        println(r2 + " " + r3 + " " + r4 + " " + r5 + " " + maxmin + " " + r6 + " " + r7)
        
        val map1 = l2.map(l => (2*l))
        val map2 = r7._1.map(l_1 => r7._2.map(l_2 => l_1 + l_2)).reverse.head
        
        val r8 = r7._1
        val r9 = r7._2
        val r10 = r8.zip(r9)
        val map3 = r10.map(l => l._1 + l._2)
        
        println(map1 + " " + map2 + " " + map3)
   }
}
