when{
        imc  < 18
        println  (" Bajo de peso")
        imc in 18.5<=..>=24.9
        println  (" Saludable")
        imc in 25.0<=..>=29.9
        println  (" sobre peso")
        imc in 30.0<=..>=34.9
        println  (" Obesidad 1")
        imc in 35.0<=..>=39.9
        println  (" Obesidad 2")
        imc > 40.0 
        println  (" Obesidad 3")
}