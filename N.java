/*

*/

import renderer.scene.*;

/**


*/
public class N extends Model
{
   /**
      The letter N.
   */
   public N()
   {
      super();

      Vertex[] v = new Vertex[20];

      int i = 0;
      v[i++] = new Vertex(0.00, 0.00, 0.0);
      v[i++] = new Vertex(0.00, 1.00, 0.0);
      v[i++] = new Vertex(0.25, 1.00, 0.0);
      v[i++] = new Vertex(0.75, 0.5,  0.0);
      v[i++] = new Vertex(0.75, 1.0,  0.0);
      v[i++] = new Vertex(1.00, 1.0,  0.0);
      v[i++] = new Vertex(1.00, 0.0,  0.0);
      v[i++] = new Vertex(0.75, 0.0,  0.0);
      v[i++] = new Vertex(0.25, 0.5,  0.0);
      v[i++] = new Vertex(0.25, 0.0,  0.0);

      // Create line segments.
      addLineSegment(v[0], v[1]);
      addLineSegment(v[1], v[2]);
      addLineSegment(v[2], v[3]);
      addLineSegment(v[3], v[4]);
      addLineSegment(v[4], v[5]);
      addLineSegment(v[5], v[6]);
      addLineSegment(v[6], v[7]);
      addLineSegment(v[7], v[8]);
      addLineSegment(v[8], v[9]);
      addLineSegment(v[9], v[0]);



      v[i++] = new Vertex(0.00, 0.00, -0.25);
      v[i++] = new Vertex(0.00, 1.00, -0.25);
      v[i++] = new Vertex(0.25, 1.00, -0.25);
      v[i++] = new Vertex(0.75, 0.5,  -0.25);
      v[i++] = new Vertex(0.75, 1.0,  -0.25);
      v[i++] = new Vertex(1.00, 1.0,  -0.25);
      v[i++] = new Vertex(1.00, 0.0,  -0.25);
      v[i++] = new Vertex(0.75, 0.0,  -0.25);
      v[i++] = new Vertex(0.25, 0.5,  -0.25);
      v[i++] = new Vertex(0.25, 0.0,  -0.25);

      // Create line segments.
      addLineSegment(v[10], v[11]);
      addLineSegment(v[11], v[12]);
      addLineSegment(v[12], v[13]);
      addLineSegment(v[13], v[14]);
      addLineSegment(v[14], v[15]);
      addLineSegment(v[15], v[16]);
      addLineSegment(v[16], v[17]);
      addLineSegment(v[17], v[18]);
      addLineSegment(v[18], v[19]);
      addLineSegment(v[19], v[10]);



      addLineSegment(v[0], v[10]);
      addLineSegment(v[1], v[11]);
      addLineSegment(v[2], v[12]);
      addLineSegment(v[3], v[13]);
      addLineSegment(v[4], v[14]);
      addLineSegment(v[5], v[15]);
      addLineSegment(v[6], v[16]);
      addLineSegment(v[7], v[17]);
      addLineSegment(v[8], v[18]);
      addLineSegment(v[9], v[19]);
   }
}
