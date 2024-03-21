export interface Post {
  filter(arg0: (p: any) => any): any
  id: number
  title: string
  body: string
  userId: number
  tags: string[]
  active: boolean
}
