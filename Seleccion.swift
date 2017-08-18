import Foundation

class FetchClass 
{
    var vector: [Int] = []
    func fetch(n: Int)->Int
    {
        preconditionFailure("This method must be overridden")
    }
    
    func setV(v: [Int])
    {
        self.vector = v
    }
    func randomV(dato:Int)->[Int]
    {
        var v:[Int] = [Int]()
        for _ in 0...(dato-1)
        { 
            v.append(Int(rand() % 200)) 
            //v.append(Int(arc4random_uniform(200)))
        }
        return v
    }
    func getV()->[Int]
    {
        return self.vector
    }
    func showV()
    { 
        let count:Int = self.vector.count-1
        
        var string = "[ "
        for(index) in 0...count
        {
            string+=String(self.vector[index])
            string+=","
        }
        
        string = String(string.characters.dropLast()) + " ]"
        
        print(string)
    }
    func showF(dato: Int)
    {
    
        if(dato==(-1))
            {
                print("Favor de verificar si el número se encuentra dentro del vector")
            }
                else
                    {
                        print("El numero está en la posición \(dato)")
                    }
    }
}

protocol Sorting
{
        func sort()
    }

class binario: FetchClass
{
    func sort()
    {
    var m = 0
    var temp = 0
    for index in 0...vector.count-1
    {
        m=index
        for index2 in stride(from: index+1, to: vector.count-1, by: 1)
        {
            if(vector[index2]<vector[index])
                {
                    m=index2
                }
        }
    temp=vector[index]
    vector[index]=vector[m]
    vector[m]=temp
        }
    }
    override func fetch(n: Int) -> Int
    {
        var centro: Int = 0
        var inicio: Int = 0
        var fin: Int = self.vector.count-1
        
        while(inicio<=fin)
        { 
            centro  =   (inicio+fin) / 2 
            
            if (self.vector[centro]==n)
            {
                return centro
            }
            
            if(n < self.vector[centro])
            {
                fin = centro-1 
                }
                    else 
                        {
                            inicio = centro+1 
                        }
        }
        return -1
    }
}

class secuencial: FetchClass
{
    override func fetch(n: Int) -> Int
    {
        let count: Int = self.vector.count-1
        for i in 0...count
        {
            if(self.vector[i]==n){return i}
        }
        return -1
    }
}

    var test:  secuencial = secuencial()
    
    test.setV(v:test.randomV(dato: 500))
    test.showV()
    
    test.showF(dato: test.fetch(n: 560))
    var test2:binario = binario()
    
    test2.setV      (v: test2.randomV(dato: 35))
    test2.sort()
    test2.showV()
    test2.showF(dato: test2.fetch(n: 20))
