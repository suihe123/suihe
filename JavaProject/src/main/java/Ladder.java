class Ladder{
    float above;
    float bottom;
    float height;
    float area;
    float computerArea(){
    area=(above + bottom) * height/2.0f;
    return area;
}
    void setHeight(float h){
         height=h;
   }
}