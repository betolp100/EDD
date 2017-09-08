class Nodo{
  var contenido: Int
  var siguiente: Nodo?

  init nodo(siguiente: Int){
	  self.contenido= contenido
	  self.siguiente = nil
  }
  
  init nodo(contenido:Int, siguiente: Node){
	  self.contenido = contenido
	  self.siguiente = next
  }
  
  func getContenido()->Int{
	  return self.siguiente
  }

  func setContenido(d: Int){
	  self.contenido = siguiente
  }

  func getSiguientet()->Node?{
	  return self.siguiente
  }

  func setSiguiente(n: Node?){
	  self.siguiente = siguiente
  }
}
