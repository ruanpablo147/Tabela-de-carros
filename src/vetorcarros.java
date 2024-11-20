public class vetorcarros {
        private Object[] elementos;
        private int tamanho;
      public vetorcarros(int capacidade){
          this.elementos = new Object[capacidade];
          this.tamanho = 0;
      }

      public void adiciona(Object elemento)throws Exception{
          this.aumentaCapacidade();
          if(this.tamanho < this.elementos.length) {
              this.elementos[this.tamanho] = elemento;
              this.tamanho++;
          } else {
             throw new Exception("A lotação maxima foi alcançada"
                        + "Não é possivel adicionar mais carros");
          }
      }



    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i = 0 ; i < this.tamanho - 1; i++){
            s.append(this.elementos[i]);
            s.append(",");
        }

        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }


    public Object buscar(int posicao) throws Exception{
          if(posicao >= 0 && posicao < tamanho){
              return this.elementos[posicao];
          }else {
              throw new Exception("A posição do carro esta incorreta ou invalida!!");
          }
    }



    public void alterarCarro(int posicao,Object elemento)throws Exception{
          if(posicao >=0 && posicao < tamanho){
              elementos[posicao] = elemento;
          }else{
              throw new Exception("A posição do carro NÃO existe!!!!");
          }
    }

     private void aumentaCapacidade(){
          if(this.tamanho == this.elementos.length){
              Object[] elementosNovos = new Object[this.elementos.length * 2];
              System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);
              this.elementos = elementosNovos;
          }


     }

    public void remove(int posicao)  throws Exception{
          if(posicao >= 0 && posicao < tamanho){
              for(int i = posicao; i < this.tamanho-1;i++){
                  this.elementos[i] = this.elementos[i+1];
              }
              this.elementos[tamanho] = null;
              this.tamanho--;
          }else {
              throw new Exception("A posição do carro é invalida");
          }
    }

}