/*

*/

import renderer.scene.*;

/**


*/
public class W extends Model
{
   /**
      The letter W.
   */
   public W()
   {
      super();

      Vertex[] v = new Vertex[26];

      int i = 0;
      v[i++] = new Vertex(0.0, 1.00, 0.0);
      v[i++] = new Vertex(0.2, 1.00, 0.0);
      v[i++] = new Vertex(0.3, 0.45, 0.0);
      v[i++] = new Vertex(0.4, 1.00, 0.0);
      v[i++] = new Vertex(0.6, 1.00, 0.0);
      v[i++] = new Vertex(0.7, 0.45, 0.0);
      v[i++] = new Vertex(0.8, 1.00, 0.0);
      v[i++] = new Vertex(1.0, 1.00, 0.0);
      v[i++] = new Vertex(0.8, 0.00, 0.0);
      v[i++] = new Vertex(0.6, 0.00, 0.0);
      v[i++] = new Vertex(0.5, 0.55, 0.0);
      v[i++] = new Vertex(0.4, 0.00, 0.0);
      v[i++] = new Vertex(0.2, 0.00, 0.0);

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
      addLineSegment(v[9], v[10]);
      addLineSegment(v[10], v[11]);
      addLineSegment(v[11], v[12]);
      addLineSegment(v[12], v[0]);


      v[i++] = new Vertex(0.0, 1.00, -0.25);
      v[i++] = new Vertex(0.2, 1.00, -0.25);
      v[i++] = new Vertex(0.3, 0.45, -0.25);
      v[i++] = new Vertex(0.4, 1.00, -0.25);
      v[i++] = new Vertex(0.6, 1.00, -0.25);
      v[i++] = new Vertex(0.7, 0.45, -0.25);
      v[i++] = new Vertex(0.8, 1.00, -0.25);
      v[i++] = new Vertex(1.0, 1.00, -0.25);
      v[i++] = new Vertex(0.8, 0.00, -0.25);
      v[i++] = new Vertex(0.6, 0.00, -0.25);
      v[i++] = new Vertex(0.5, 0.55, -0.25);
      v[i++] = new Vertex(0.4, 0.00, -0.25);
      v[i++] = new Vertex(0.2, 0.00, -0.25);

      // Create line segments.
      addLineSegment(v[13], v[14]);
      addLineSegment(v[14], v[15]);
      addLineSegment(v[15], v[16]);
      addLineSegment(v[16], v[17]);
      addLineSegment(v[17], v[18]);
      addLineSegment(v[18], v[19]);
      addLineSegment(v[19], v[20]);
      addLineSegment(v[20], v[21]);
      addLineSegment(v[21], v[22]);
      addLineSegment(v[22], v[23]);
      addLineSegment(v[23], v[24]);
      addLineSegment(v[24], v[25]);
      addLineSegment(v[25], v[13]);


      addLineSegment(v[0], v[13]);
      addLineSegment(v[1], v[14]);
      addLineSegment(v[2], v[15]);
      addLineSegment(v[3], v[16]);
      addLineSegment(v[4], v[17]);
      addLineSegment(v[5], v[18]);
      addLineSegment(v[6], v[19]);
      addLineSegment(v[7], v[20]);
      addLineSegment(v[8], v[21]);
      addLineSegment(v[9], v[22]);
      addLineSegment(v[10], v[23]);
      addLineSegment(v[11], v[24]);
      addLineSegment(v[12], v[25]);
   }
}
