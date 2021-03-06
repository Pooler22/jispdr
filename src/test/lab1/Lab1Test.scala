//import org.junit.Assert._
//import org.junit.Test
//
//class Lab1Test {
//  @Test def exercise1_correct() {
//    val input = "-3 + 4 - 1 + 1 + 13 - 5 + 6"
//    val correctResult = 15
//    val result = ab1.calculateExpression(input.split(" ").toList)
//    assert(result == correctResult)
//  }
//
//  @Test(expected = classOf[NumberFormatException])
//  def exercise1_error() {
//    val input = "#error"
//    lab1.calculateExpression(input.split(" ").toList)
//  }
//
//  @Test def exercise2_correct() {
//    Vector[Int](6, 28, 496, 8128).foreach(x => assert(lab1.isExcellentNumber(x)))
//  }
//
//  @Test def exercise2_error() {
//    Vector[Int](5, 27, 495, 8127).foreach(x => assertFalse(lab1.isExcellentNumber(x)))
//  }
//
//  @Test def exercise2_v2_correct() {
//    Vector[Int](6, 28, 496, 8128).foreach(x => assert(lab1.isExcellentNumber_v2(x)))
//  }
//
//  @Test def exercise2_v2_error() {
//    Vector[Int](5, 27, 495, 8127).foreach(x => assertFalse(lab1.isExcellentNumber_v2(x)))
//  }
//}